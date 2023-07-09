const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res)=>{
    console.log(req.url, req.method);

    //set header
    res.setHeader('Content-type', 'text/html');

    let path= './views/';

    switch(req.url){
        case '/':
            res.statusCode = 200;
            path += 'index.html';
            break;

        case '/about':
            res.statusCode = 200;
            path += 'about.html';
            break;
               
        case '/about-me':
            //redirect
            res.statusCode = 301;
            res.setHeader('Location', '/about');
            res.end();

        default:
            res.statusCode = 404;
            path += '404.html';
            break;
    }

    fs.readFile(path ,(err, data)=>{
        if(err){
            console.log(err);
        }else{
        
            res.end(data);
        }
    })
})

server.listen(3000,'localhost',()=>{
    console.log('listening on port 3000');
})

var express = require('express');
var bodyParser = require('body-parser');
var http = require('http');
var options = {
  host: 'www.google.com',
  path: '/index.html'
};
var app = express();

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json())

app.get('/in/', function (req, res) {
    var req = http.get(options, function(retorno) {
      console.log('STATUS: ' + retorno.statusCode);
      console.log('HEADERS: ' + JSON.stringify(retorno.headers));
    
      // Buffer the body entirely for processing as a whole.
      var bodyChunks = [];
      retorno.on('data', function(chunk) {
        // You can process streamed parts here...
        bodyChunks.push(chunk);
      }).on('end', function() {
        var body = Buffer.concat(bodyChunks);
        console.log(body);
        res.send(body);
      })
    });
});

app.post('/in/', function (req, res) {
    var clientServerOptions = {
        uri: 'http://'+options.host+''+options.path,
        body: JSON.stringify(req.body),
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        }
    }
    request(clientServerOptions, function (error, response) {
        console.log(error,response.body);
        res.send(body)
    });
});

app.listen(3000, function () {
    console.log('Example app listening on port 3000!');
});

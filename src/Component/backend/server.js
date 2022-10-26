
import fetch from 'node-fetch'

// const fetch = require('node-fetch');

function getData() {
    return fetch('http://localhost:8080/hello')
    .then((response) => response.json())
    .then((responseJson) => {
        console.log(responseJson);
      return responseJson.movies;
    })
    .catch((error) => {
      console.error(error);
    });
 }
 
 getData();
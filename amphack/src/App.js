import React from 'react';
import logo from './logo.svg';
import './App.css';
import Iframe from 'react-iframe'

function App() {
  return (
    <div className="App"
    style = {{
      "margin-top": "50px",
      "margin": "auto",
      "width": "80%",
      "border": "3px",
      "padding": "10px"
      }}>
      <Iframe url="https://airtable.com/embed/shr5HNAiyZjXLPwOK?backgroundColor=blue&viewControls=on" 
        width="100%" height="700"
        id="myId"
        className="airtable-embed"
        display="initial"
        style={{"background":"transparent","border":"1px solid #ccc"}}
        position="relative"/>
    </div>
  );
}

export default App;

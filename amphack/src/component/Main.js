import React from 'react';
import Iframe from 'react-iframe'
import {AppBar,Toolbar,Typography,} from '@material-ui/core';

class Main extends React.Component {
    /*constructor(props) {
        super(props)
    }
  */
  render() {
    
      return(
        <div>
              <AppBar style={{ background: '#1776D1' }} position="static">
                <Toolbar>
                  <Typography variant="h6" >
                      Business Detail
                  </Typography>                
                </Toolbar>
            </AppBar>
            <div
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
        </div>
    );
  }
}

export default Main;
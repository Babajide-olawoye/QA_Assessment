

import logo from './logo.svg';
import './App.css';
// import express from 'express'
import cors from 'cors'


// import SignUpPage from './Component/signupPage';
import LoginPage from './Component/LoginPage';
import { Component } from 'react';


class App extends Component {
  state = {
    data: []
  };

  async componentDidMount() {
    const response = await fetch('/hello');
    const body = await response.json();
    this.setState({data: body});
  }


  render() {
    const datas = this.state.data;
    
    console.log(datas);

    return (
        <div className="App">
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <div className="App-intro">
              <h2>Clients</h2>
              {datas?.map(data =>
                  <div key={data.userName}>
                    {data.fName} ({data.lName})
                  </div>
              )}
              
            </div>
          </header>
        </div>
    );
  }
}
export default App;
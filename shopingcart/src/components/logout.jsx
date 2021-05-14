import React, { Component } from 'react'
import { Link } from "react-router-dom";
import authservices from "../services/authservices"
export default class logout extends Component {
    handleButton = () => {
        authservices.logout();
        this.props.history.push("/");
        window.location.reload();
        
      };
    render() {
        return (
           <React.Fragment>
                <div className="container">
                    
                <div className="container-fluid">
                <div clssname="logout">
                   <h1>Are you sure? wanna logout!</h1>
                   <div className="">
                       <button  onClick={this.handleButton} className="btn-primary">
                           Logout
                       </button>
                       <button  onClick={this.handleButton} className="btn-primary">
                       <Link to="login"><span className="logou">SignIn</span></Link>
                       </button>
                   </div>
                   </div>
                </div>
            </div>
           </React.Fragment>
        )
    }
}

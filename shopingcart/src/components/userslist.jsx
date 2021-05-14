import React, { Component } from 'react'
import userservice from '../services/userservice'
import {Link} from "react-router-dom";
import Adminfooter from "../components/adminfooter";
import Admin from "../components/Admin"
 class userslist extends Component {
     constructor(props) {
         super(props)

         this.state ={
             users: []
         }
     }
     componentDidMount()
     {
         userservice.getusers().then((res) => {
             this.setState({users :res.data});
         });
     }
    render() {
        return (
            <React.Fragment>
                <Admin/>
            <div className="container">
                <h2 className="text-center">Users</h2>
               {/*  <Link to ="Admin">Back</Link> */}

             <div className="row">
               <tatble className="table table-striped">
                   <thead>
                       <tr className="tr">
                           <th >Firstname</th>
                           <th>Last name</th>
                           <th>username</th>
                           <th>roles</th>
                           <th>email</th>
                          
                       </tr>
                   </thead>
                   <tbody>
                       {
                           this.state.users.map(
                            user =>
                            <tr key ={user.username}>
                                <td>{user.firstName}</td>
                                <td>{user.lastName}</td>
                                <td>{user.username}</td>
                                <td>{user.roles}</td>
                                <td>{user.email}</td>
                              
                            </tr>
                           )
                       }
                   </tbody>
               </tatble>
               </div>
            </div>
            <Adminfooter/>
            </React.Fragment>
        )
    }
}

export default userslist;
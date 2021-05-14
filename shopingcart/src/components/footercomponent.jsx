import React, { Component } from 'react'
import '../App.css';

 class footercomponent extends Component {

    constructor(props) {
        super(props)

        this.state ={
            
        }
        
        this.viewproducts=this.viewproducts.bind(this);
    }
  
    viewproducts()
    {
        this.props.history.push('/products')
    }
   
    render() {
        return (
            <div className="main-footer">
                <div className="container">
                    <div className="row">
                       <div className="col-md-4">
                          <ol className="list-unstyled">
                          
                              <li className="flist" onClick={this.viewproducts}>products</li>
                              <li className="flist" onClick={this.login}>login</li>
                              <li className="flist"onClick={this.Admin}>Admin</li>
                            </ol>
                            </div>
                            <div className="col-md-4">
                          <ol className="list-unstyled">
                              <li className="flist">asdfgh</li> 
                              <li className="flist">asdfghj</li>
                              <li className="flist">zsxdcfvgbn</li>
                            </ol>
                            </div>
                            <div className="col-md-4">
                          <ol className="list-unstyled">
                              <li className="flist">asdcv</li>
                              <li className="flist">zxcvb</li>
                              <li className="flist">asdfghj</li>
                            </ol>
                            </div>
                        </div>
                        <hr/>
                        <div className="row">
                            <p className="col-sm">
                                &copy;shopingcart| all rights are reserved
                            </p>
                        </div>
                </div>
            </div>
        )
    }
 }
 export default footercomponent;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb;
import com.example.common.HelloWorld;
import java.io.Serializable;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author yandypiedra
 */
@Stateless
@Remote(value = HelloWorld.class)
public class HelloWorldEJB implements HelloWorld, Serializable  {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}

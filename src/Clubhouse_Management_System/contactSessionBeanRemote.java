/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clubhouse_Management_System;

import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface contactSessionBeanRemote {

    String send(String name, String email, String message);
    
}

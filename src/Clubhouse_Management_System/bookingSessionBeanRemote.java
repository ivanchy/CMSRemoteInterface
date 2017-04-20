/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clubhouse_Management_System;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author admin
 */
@Remote
public interface bookingSessionBeanRemote {
    
    String findByService(String service);
    String findByTime(String date, String time);
    void send();
     public List<String> service();
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.main.services;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author hcadavid
 */
public interface ApiService {
    
    String getJSONBYCITY(String city) throws IOException;
    
    
}

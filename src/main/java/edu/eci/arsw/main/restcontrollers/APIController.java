/*
 * Copyright (C) 2016 Pivotal Software, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.arsw.main.restcontrollers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.eci.arsw.main.services.ApiService;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Juan
 */

@RestController
@RequestMapping(value = "/apiweather") 
 public class APIController {
        
        @Autowired
        @Qualifier("Stub")
        ApiService apiservice;
        
        @GetMapping("/{city}")
        public ResponseEntity<?> GetJsonAlpha(@PathVariable String city){
 		try {
 			//obtener datos que se enviarán a través del API
 			return new ResponseEntity<>(apiservice.getJSONBYCITY(city),HttpStatus.ACCEPTED);
 		} catch (Exception ex) {
 			return new ResponseEntity<>("Error 404"+ex,HttpStatus.NOT_FOUND);
 		}  
 	}
        
}       
 


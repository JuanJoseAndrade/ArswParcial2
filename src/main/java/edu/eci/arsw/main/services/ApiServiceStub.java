package edu.eci.arsw.main.services;



import edu.eci.arsw.httpConnection.ApiWeather;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("Stub")
public class ApiServiceStub implements ApiService {

  ApiWeather apiservice;

    public ApiServiceStub() {
        
    }

    @Override
    public String getJSONBYCITY(String city) throws IOException {
        return apiservice.getJson(city);
    }

 


}

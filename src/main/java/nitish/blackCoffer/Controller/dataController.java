package nitish.blackCoffer.Controller;

import nitish.blackCoffer.DTOs.GetSectorWithCount;
import nitish.blackCoffer.Models.Data;
import nitish.blackCoffer.Service.dataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("data")
public class dataController {
    @Autowired
    dataService dataservice;

    @GetMapping("/getSectorsWithCount")
    public ResponseEntity getSectorWithCounts(){

        List<GetSectorWithCount> list=dataservice.getSectorWithCounts();
        return new ResponseEntity<>(list,HttpStatus.OK );
    }
}

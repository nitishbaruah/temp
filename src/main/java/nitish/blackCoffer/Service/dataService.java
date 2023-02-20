package nitish.blackCoffer.Service;

import nitish.blackCoffer.DTOs.GetSectorWithCount;
import nitish.blackCoffer.Repository.dataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class dataService {
    @Autowired
    dataRepository datarepository;

    public List<GetSectorWithCount> getSectorWithCounts(){
        List<String> sector=datarepository.getSectorAndCount();
        Map<String,Integer> map= new HashMap<>();
        List<GetSectorWithCount> list=new ArrayList<>();
        for(String s:sector){
            if(!s.equals("")) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        for(String s:map.keySet()){
            GetSectorWithCount secCount=new GetSectorWithCount();
            secCount.setSector(s);
            secCount.setCount(map.get(s));
            list.add(secCount);
        }
        return list;
    }
}

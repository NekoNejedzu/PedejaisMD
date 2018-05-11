/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.va.sludinajumuportals.service;

import java.util.ArrayList;
import java.util.List;
import lv.va.sludinajumuportals.domain.Advertisement;

/**
 *
 * @author User
 */
public class UserService {
    
    public List<Advertisement> UserList;
    
    
    public Advertisement getUser() {
        Advertisement advertisement = new Advertisement(1L, "Pēteris", "Mareks", "Jānis");
        return advertisement;
    }
    
    
        public List<Advertisement> getUserByName(String author) {
        List<Advertisement> filteredByName = new ArrayList<>();
        for (Advertisement advertisement : UserList) {
            if(advertisement.getAuthor().matches(author)) {
                filteredByName.add(advertisement);
            }
        }
        return filteredByName;
    }
    
}

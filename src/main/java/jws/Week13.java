package jws;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Week13 {
    public static void main(String[] args) {
        //["119", "97674223", "1195524421"] return = false
        //["12","123","1235","567","88"] return = false

        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(new Week13().solution(phone_book));
    }
    public boolean solution(String[] phone_book) {
        //["119", "97674223", "1195524421"] return = false
        //["12","123","1235","567","88"] return = false

//        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(String phone : phone_book) {
            set.add(phone);
        }

        for(String phone : phone_book) {
            for(int i = 1; i < phone.length(); i++) {
                if(set.contains(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        //모든 phone 번호 hashMap에 담기
//        for (int i = 0; i < phone_book.length; i++) {
//            map.put(phone_book[i], i);
//        }
//
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 0; j < phone_book[i].length(); j++) {
//                if (map.containsKey(phone_book[i].substring(0, j))) {
//                    return false;
//                }
//            }
//        }
        return true;
    }
}
package com.mpather47.git.utility;

import java.util.UUID;

public class Helper {
    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}

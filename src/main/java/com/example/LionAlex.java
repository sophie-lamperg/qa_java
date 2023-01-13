package com.example;

import java.util.List;

public class LionAlex extends Lion {
    public LionAlex(Feline feline) throws Exception {
        super("Самец", feline);
    }
    @Override
    public int getKittens() {
        return 0;
    }
    public String getCity() {
        return "NewYork";
    }
    public List<String> getHobby() {
        return List.of("Есть", "Бегать", "Болтать");
    }
}

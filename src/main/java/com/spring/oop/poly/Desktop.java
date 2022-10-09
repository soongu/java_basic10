package com.spring.oop.poly;

import com.spring.oop.inherit.Player;
import com.spring.oop.inherit.Warrior;

import java.util.Scanner;

public class Desktop {

    Monitor monitor;

    Object[] arr;

    public Desktop() {
        this.monitor = new LgMonitor();

        arr = new Object[] {
                new LgMonitor()
                , new HpMonitor()
                , new Player()
                , ""
                , 30
        };
    }
}

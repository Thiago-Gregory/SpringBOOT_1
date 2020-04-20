package com.Gregory.HelloWorldLombok.controller;

import com.Gregory.HelloWorldLombok.model.Consoles;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @author Thiago Araújo
 * @since 15/04/2020 - 23:06
 * @version 1.0
 */

@RestController
public class ConsolesController {

    @GetMapping("/console")
    public Consoles getConsole() {
        Consoles console = new Consoles();
        console.setName("PlayStaion 4");
        console.setManufacturer("Sony");
        console.setSizeHD("500 GB");
        console.setReleaseYear(2013);

        return console;
    }

    @GetMapping("/listconsole")
    public ArrayList<Consoles> getListConsole() {
        Consoles console1 = new Consoles();
        console1.setName("PlayStaion 4");
        console1.setManufacturer("Sony");
        console1.setSizeHD("500 GB");
        console1.setReleaseYear(2013);

        Consoles console2 = new Consoles();
        console2.setName("Xbox One");
        console2.setManufacturer("Microsoft");
        console2.setSizeHD("500 GB");
        console2.setReleaseYear(2013);

        ArrayList<Consoles> consoles = new ArrayList<>();
        consoles.add(console1);
        consoles.add(console2);

        return consoles;
    }
}

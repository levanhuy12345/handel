/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Repository.PersonRepository;
import View.Menu;


/**
 *
 * @author hieu
 */
public class ManagerMenu extends Menu<String>{
    static String[] mc = {"Find person info", "Copy Text to new file", "Exit"};
    PersonRepository program;

    public ManagerMenu() {
        super("\nFile Processing", mc);
        program = new PersonRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.findPersonInfo();
                break;
            case 2:
                program.copyNewFile();
                break;
            case 3:
                System.exit(0);
        }
    }
}

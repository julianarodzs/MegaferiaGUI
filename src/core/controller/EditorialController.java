/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controller;

import core.controller.utils.Response;
import core.controller.utils.Status;
import core.model.persona.Manager;
import core.model.storage.PersonaStorage;
import java.util.ArrayList;

public class EditorialController {

    public static Response createEditorial(String nit, String name, String address, String managerInfo) {
        PersonaStorage personasData = PersonaStorage.getInstance();
        ArrayList<Manager> administradores = new ArrayList<>();

        try {
            if (!nit.matches("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d$")) {
                return new Response("NIT must be in this format XXX.XXX.XXX-X", Status.BAD_REQUEST);
            }
            String[] managerData = managerInfo.split(" - ");

            try {
                long managerId = Long.parseLong(managerData[0]);
                
            } catch (NumberFormatException e) {
                return new Response("")
            }

            Manager manager = null;
            for (Manager manag : ) {
                if (manag.getId() == managerId) {
                    manager = manag;
                }
            }
        } catch (Exception e) {
        }
    }
}

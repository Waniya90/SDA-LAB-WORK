/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programminglangugae;

/**
 *
 * @author Hp
 */
interface Language {
    String getName();
}

// Implement the ProgrammingLanguage class
class ProgrammingLanguage implements Language {
    private String name;

    public ProgrammingLanguage(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}


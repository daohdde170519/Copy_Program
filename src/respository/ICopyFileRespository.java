/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package respository;

import model.Config;

/**
 *
 * @author DAO
 */
public interface ICopyFileRespository {
    void readFileConfig();
    void createFileConfig();
    boolean checkConfig(Config config);
    void copyFolder(Config config);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Luis Enrique
 */
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Manejador implements ActionListener
{
    private Procesos miProcesos;
    public Manejador(Procesos procesos)
    {
        miProcesos=procesos;
    }
    public void actionPerformed(ActionEvent evento)
    {
        miProcesos.calcular();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.PanelBajo;
import Vista.VentanaPrincipal;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Luis Enrique
 */
public class Procesos
{
    private PanelBajo panelBajo;
    private Manejador manejador;
    private VentanaPrincipal ventanaPrinc;
    private ArrayList array;
    public Procesos()
    {
        manejador=new Manejador(this);
        panelBajo=new PanelBajo();
        panelBajo.establecerMetodos(manejador);
        ventanaPrinc=new VentanaPrincipal();
    }
    private void calcular1() throws IOException
    {
        Pattern patron=Pattern.compile("(+||-||*||/)*([0-9]{0,3}\\s[0-9]{0-3}.[0-9][0,3]||[0-9]{0,3},[0-9]{0-3}.[0-9][0,3])*");
        Matcher matcher=patron.matcher(panelBajo.retornarExp());
        matcher.find();
        array=new ArrayList<String>();
        for(int i=0;i<matcher.groupCount();i++)
        {
            array.add(matcher.group(i));
        }
        while(array.size()>1)
        {
            int total=0;
            for(int i=0;i<array.size();i++)
            {
                if(array.get(i).equals("*"))
                {
                    System.out.print("kshgfksgfksdhbsd");
                }
                
            }
        }
    }
    public void calcular()
    {
        try
        {
            calcular1();
        } catch (IOException ex) {
            Logger.getLogger(Procesos.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            JOptionPane.showMessageDialog(null, 
                    "El polinomio digitado no esta de la forma correcta");
        }
    }
}

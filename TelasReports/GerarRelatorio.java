/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasReports;

import ValgaSis.Conexao;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author jucabnu
 */
public class GerarRelatorio {
    
    public void gerar(String relatorio) throws JRException{
      
      try {    
           URL arquivo = getClass().getResource(relatorio);             
           Map<String, Object> map = new HashMap<String, Object>();  
           JasperReport jasperReport = (JasperReport) JRLoader.loadObject(arquivo);    
           JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, map, Conexao.getConnection());   
           JasperViewer jrviewer = new JasperViewer(jasperPrint, false);    
           jrviewer.setVisible(true);   
           jrviewer.toFront();  
         }catch (JRException ex) {    
            JOptionPane.showMessageDialog(null, ex);   
        }  
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
/**
 *
 * @author HP
 */
public class exportercolis {
    public static void exporter(DefaultTableModel tabl){
        try {
            int nc=tabl.getColumnCount(),
                    nl=tabl.getRowCount();
            //creer feuille Exel
            WritableWorkbook feuille=Workbook.createWorkbook(new File("C:/Users/Public/liste.xls"));
            WritableSheet Feuille2=feuille.createSheet("liste", 0);
            Label n;
            for(int i=1;i<nc;i++){
                n=new Label(i-1,0,tabl.getColumnName(i));
                Feuille2.addCell(n);
            }
            for(int i=0;i<nl;i++){
                for(int j=1;j<nc;j++){
                    n= new Label(j-1,i+1,tabl.getValueAt(i, j).toString());
                    Feuille2.addCell(n);
                }
            }
            feuille.write();
            feuille.close();
        } catch (Exception ex) {
            Logger.getLogger(exportercolis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

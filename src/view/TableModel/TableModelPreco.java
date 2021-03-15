package view.TableModel;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Preco;
import model.DAO.PrecoDAO;

public class TableModelPreco extends AbstractTableModel
{
    List<Preco> precos;
    
    public TableModelPreco()
    {
        precos = PrecoDAO.buscarTodos();
    }

    @Override
    public int getColumnCount()
    {
        return 5;
    }
    
    @Override
    public String getColumnName(int index)
    {
        switch (index)
        {
            case 0:
                return "At� uma hora";
            case 1:
                return "At� duas horas";
            case 2:
                return "At� tr�s horas";
            case 3:
                return "Ap�s tr�s horas";
            case 4:
                return "Pernoite";
                
            default:
                break;
        }
        return null;
    }
    
    @Override
    public int getRowCount()
    {
        return precos.size();
    }

    @Override
    public Object getValueAt(int linha , int coluna)
    {
        Preco preco = precos.get(linha);
        
        switch (coluna)
        {
            case 0:
                return preco.getAteUmaHora();
            case 1:
                return preco.getAteDuasHoras();
            case 2:
                return preco.getAteTresHoras();
            case 3:
                return preco.getAposTresHoras();
            case 4:
                return preco.getPernoite();
                
            default:
                break;
        }
        return null;
    }
}
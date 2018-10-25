package ModelDAO;

import Config.Connection;
import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class ClienteDAO {
    
    public static void adicionarCliente(Cliente cliente) throws SQLException{
        Connection con = Connection.getConnection();
        System.out.println("Conectado!");
        String sql = "insert into clientes " + "(nome, cpf, rg, telefone)" + "values (?, ?, ?, ?)";
        
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getCpf());
        stmt.setString(3, cliente.getRg());
        stmt.setString(4, cliente.getTelefone());
        
        stmt.execute();
        stmt.close();
        con.close();
    }
    
}

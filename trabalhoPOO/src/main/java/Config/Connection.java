package Config;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class Connection {
    
    private static final String STRING_CONEXAO = "";
    private static final String USUARIO_CONEXAO = "";
    private static final String SENHA_CONEXAO = "";
    
    public static Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(STRING_CONEXAO, USUARIO_CONEXAO, SENHA_CONEXAO);
    }

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

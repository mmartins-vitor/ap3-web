package eco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import eco.model.Produto;

public class ProdutoDao {

	public void cadastrarProduto(Produto produto) {

		String sql = "INSERT INTO PRODUTO VALUES (null,?,?,?,?,?)";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);

			pStatement.setString(1, produto.getTipo());
			pStatement.setInt(2, produto.getComprimento());
			pStatement.setInt(3, produto.getLargura());
			pStatement.setInt(4, produto.getQuantidade());
			pStatement.setDouble(5, produto.getPreco());
			pStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

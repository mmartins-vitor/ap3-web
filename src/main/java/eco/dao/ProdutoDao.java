package eco.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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
	
	public Produto BuscarProdutoPorId (int id) {
		String sql = "SELECT * FROM PRODUTO WHERE idProduto = ?";
		ResultSet  rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Produto produto = null;
		
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, id);
			rs = pStatement.executeQuery();
			if (rs != null && rs.next()) {
				produto = new Produto();
				produto.setIdProduto(rs.getInt("idProduto"));
				produto.setTipo(rs.getString("tipo"));
				produto.setComprimento(rs.getInt("comprimento"));
				produto.setLargura(rs.getInt("largura"));
				produto.setQuantidade(rs.getInt("quantidade"));
				produto.setPreco(rs.getDouble("preco"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pStatement != null)
					pStatement.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return produto; 
	}

	public ArrayList<Produto> buscarProdutosPorTipo(String tipo) {
		String sql = "SELECT * FROM PRODUTO WHERE tipo LIKE '%" + tipo + "%'";
		ResultSet rs = null;
		Connection conn = null;
		PreparedStatement pStatement = null;
		Produto produto = null;
		ArrayList<Produto> produtos = null;
		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			rs = pStatement.executeQuery();
			if (rs != null) {
				produtos = new ArrayList<Produto>();
				while (rs.next()) {
					produto = new Produto();
					produto.setIdProduto(rs.getInt("idProduto"));
					produto.setTipo(rs.getString("tipo"));
					produto.setComprimento(rs.getInt("comprimento"));
					produto.setLargura(rs.getInt("largura"));
					produto.setQuantidade(rs.getInt("quantidade"));
					produto.setPreco(rs.getDouble("preco"));
					produtos.add(produto);
				}
			}

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

		return produtos;
	}

	public void ExcluirProduto(int idProduto) {
		String sql = "DELETE FROM PRODUTO WHERE idProduto = ?";
		PreparedStatement pStatement = null;
		Connection conn = null;

		try {
			conn = new MySqlConnection().getConnection();
			pStatement = conn.prepareStatement(sql);
			pStatement.setInt(1, idProduto);
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
	
	public void AlterarProduto (Produto produto) {
		
		String sql = "UPDATE PRODUTO SET tipo = ?, comprimento = ?, largura = ?, quantidade = ?, preco = ? WHERE idProduto = ?";
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
			pStatement.setInt(6, produto.getIdProduto());
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

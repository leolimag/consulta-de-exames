package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/consultorio?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "root123";
	
	public Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void criarExame(JavaBeans exame) {
		String create = "insert into exame (nm_Paciente, ds_Exame, ds_Resultado, dt_Exame) values (?, ?, ?, ?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, exame.getNomePaciente());
			pst.setString(2, exame.getNomeExame());
			pst.setString(3, exame.getResultado());
			pst.setString(4, exame.getData());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<JavaBeans> listarExames() {
		ArrayList<JavaBeans> exames = new ArrayList<>(); 
		String read = "select * from exame order by nm_Paciente, ds_Exame";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String id = rs.getString(1);
				String nomePaciente = rs.getString(2);
				String nomeExame = rs.getString(3);
				String resultado = rs.getString(4);
				String data = rs.getString(5);
				String [ ]vetData = data.split("-");
				String dataFormatada = null;
				for (int i = 0; i < vetData.length; i++) {
					String ano = vetData[0];
					String mes = vetData[1];
					String dia = vetData[2];
					dataFormatada = dia + "/" + mes + "/" + ano;
				}
				exames.add(new JavaBeans(id, nomePaciente, nomeExame, resultado, dataFormatada));
			}
			con.close();
			return exames;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void selecionarExame(JavaBeans exame) {
		String read = "select * from exame where cd_Exame = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			pst.setString(1, exame.getId());
			ResultSet rs = pst.executeQuery();
			//String []data = rs.getString(5).split("-");
			while(rs.next()) {
				exame.setId(rs.getString(1));
				exame.setNomePaciente(rs.getString(2));
				exame.setNomeExame(rs.getString(3));
				exame.setResultado(rs.getString(4));
				exame.setData(rs.getString(5));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void atualizarExame(JavaBeans exame) {
		String update = "update exame set nm_Paciente = ?, ds_Exame = ?, ds_Resultado = ?, dt_Exame = ? where cd_Exame = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(update);
			pst.setString(1, exame.getNomePaciente());
			pst.setString(2, exame.getNomeExame());
			pst.setString(3, exame.getResultado());
			pst.setString(4, exame.getData());
			pst.setString(5, exame.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deletarExame(JavaBeans exame) {
		String delete = "delete from exame where cd_Exame = ?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(delete);
			pst.setString(1, exame.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}		
	}
}

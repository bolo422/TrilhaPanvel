package br.com.panvel.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBase {
	
	private static List<Company> companyList = new ArrayList<>();
	private static Map<String, User> userMap = new HashMap<>();
	private static Integer lastID = 1;
	
	static {
		companyList.add(new Company("Panvel"));
		companyList.add(new Company("Dimed"));
		
		userMap.put("adm", new User("adm", "password"));
		userMap.put("erick", new User("erick", "123"));
	}
	
	public void add(Company com) {
		DataBase.companyList.add(com);
	}
	
	public static List<Company> getCompanies(){	
		return DataBase.companyList;
	}
	
	public static Integer addLastID()
	{
		return DataBase.lastID++;
	}
	
	public static void delCompany(int id){
		if(getCompanyWithID(id) != null)
		{
			DataBase.companyList.remove(getCompanyWithID(id));
		}
	}
	
	public static void updateIDs(){
		DataBase.lastID = 1;
		DataBase.companyList.forEach(c -> c.setID(lastID++));
	}
	
	public static Company getCompanyWithID(Integer id)
	{
		for(Company c : DataBase.companyList){
			if(c.getId() == id){
				return c;
			}
		}
		return null;
	}
	
	public static void changeOrder(boolean moveUp, Integer id) {
		Company com = getCompanyWithID(id);
		if(com == null) return;
		int companyIndex = DataBase.companyList.indexOf(com);
		
		if(moveUp)
		{
			if(companyIndex <= 0)
				return;
			
			Collections.swap(DataBase.companyList, companyIndex, companyIndex-1);
		}
		else
		{
			if(companyIndex > DataBase.companyList.size()-2)
				return;
			Collections.swap(DataBase.companyList, companyIndex, companyIndex+1);
		}
	}

	public static User validadeLogin(String login, String password)
	{
		if(userMap.containsKey(login) && password.equals(userMap.get(login).getPassword()))
			return userMap.get(login);
			
		return null;
	}
}

package edu.eci.cvds.sampleprj.dao.mybatis;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import edu.eci.cvds.sampleprj.dao.ClienteDAO;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ClienteMapper;
import edu.eci.cvds.samples.entities.Item;
import edu.eci.cvds.sampleprj.dao.mybatis.mappers.ItemMapper;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.TipoItem;
import java.sql.SQLException;

public class MyBATISClienteDAO implements ClienteDAO{

  @Inject
  private ClienteMapper ClienteMapper;    

  @Override
  public void save(Cliente cl) throws PersistenceException{
  try{
      ClienteMapper.registrarCliente(cl);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      
      throw new PersistenceException("Error al registrar el cliente "+cl.toString(),e);
  }        

  }

  @Override
  public Cliente load(int doc) throws PersistenceException {
  try{
      return ClienteMapper.consultarCliente(doc);
  }
  catch(org.apache.ibatis.exceptions.PersistenceException e){
      System.out.println("JOHANN ES RE GURRERO");
      throw new PersistenceException("Error al consultar el Cliente "+doc,e);
  }


  }

  }
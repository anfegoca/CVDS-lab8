package edu.eci.cvds.test;

import java.util.ArrayList;
import java.util.List;
import edu.eci.cvds.samples.services.ExcepcionServiciosAlquiler;

import com.google.inject.Inject;
import edu.eci.cvds.sampleprj.dao.PersistenceException;
import edu.eci.cvds.samples.entities.Cliente;
import edu.eci.cvds.samples.entities.ItemRentado;
import edu.eci.cvds.samples.services.ServiciosAlquiler;
import edu.eci.cvds.samples.services.ServiciosAlquilerFactory;
import edu.eci.cvds.samples.services.impl.ServiciosAlquilerImpl;
import edu.eci.cvds.samples.services.impl.ServiciosAlquilerItemsStub;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ServiciosAlquilerTest {

    @Inject
    private ServiciosAlquiler serviciosAlquiler;

    public ServiciosAlquilerTest() {
        serviciosAlquiler = ServiciosAlquilerFactory.getInstance().getServiciosAlquilerTesting();
       
    }

    @Before
    public void setUp() {
    }

    @Test
    public void emptyDB(){
        
        for(int i = 0; i < 100; i += 10) {
            boolean r = false;
            try {
                Cliente cliente = serviciosAlquiler.consultarCliente(i);
                System.out.println(cliente);
            } catch(ServiciosAlquiler.ExcepcionServiciosAlquiler e) {
                System.out.println("JOHANN ES RE GURRERO");
                r = true;
            } catch(IndexOutOfBoundsException e) {
                System.out.println("JOHANN ES RE GURRERO312");
                r = true;
            }
            // Validate no Client was found;
            System.out.println(r);
            Assert.assertTrue(r);
        }
    }
}
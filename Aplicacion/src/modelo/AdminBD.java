package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
    /**
    * Controlador del CRUD de la base de datos.
    * @author - Quality Developers and Software
    * @version - Segundo Sprint
    * @param - controladorBD atributo que recibe el Driver de la base de datos
    * @param - host atributo que recibe el host
    * @param - puerto atributo que recibe el puerto de conexion
    * @param - baseDatos atributo que recive el nombre de la base de datos
    * @param - url atributo que recibe el host puerto y el nombre de3 la base
    * @param - usuario atributo que recibe el usuario de la base
    * @param - contraseña atributo que recibe la contraseña de la base
    * @param - Grupo variable de tipo grupo
    * @param - Horario atributo de tipo Horario,definira el horario de asesorias
    * @param - Tesis atributo de tipo tesis
    * @param - lista atributo que recibe el modelo de la tabla
    */
public class AdminBD {
    private Connection conexion;
    private ResultSet resultados;//objeto que almacena una tabla
    //o lista de una conculta de una base de  datos
    //recibe una o varial filas de una tabla
    private String controladorBD;
    private String host;
    private String puerto;
    private String baseDatos;
    private String url;
    private String usuario;
    private String contraseña;
    /*creacion de variables de sat*/
    private Asesor asesor = new Asesor();
    private Candidato candidato = new Candidato();
    private Carrera carrera = new Carrera();
    private Grupo grupo = new Grupo();
    private Horario horario= new Horario();
    private Persona persona = new Persona();
    private Tesis tesis = new Tesis();
    private DefaultTableModel lista;
    public AdminBD(){
        controladorBD= "org.postgresql.Driver";
	host= "127.0.0.1";
	puerto = "5432";
	baseDatos="bd17";/*nombre de la base de datos */
	url ="jdbc:postgresql://"+host+":"+puerto+"/"+baseDatos;
	usuario="postgres";
	contraseña="p057gr35";
	resultados=null;
	conexion =null;
    }
    public String conectate(){
        String mensaje=null;
       	try{
            Class.forName(controladorBD);
        }catch(ClassNotFoundException cnfe){
            mensaje="No se hallo el controlador de PostgreSQL";
        }
       	try{
            conexion=DriverManager.getConnection(
                url,usuario,contraseña);
       	}catch(SQLException sqe){
            mensaje ="conexion Fallo";
     	}
            return mensaje;
    }
    public String insertarCandidato(Candidato candidato){
        String mensaje=null;
        String ordenSQL=null;
        Statement proposicion=null;
        /*variables de candidato*/
        byte[] foto = null;
        String nombre = null;
        String apellidoPaterno = null;
        String apellidoMaterno = null;
        String correoElectronico = null;
        String nombreTesis = null;
        String directorTesis = null;
        String creditos = null;
        String nombreCarrera = null;
        String telefono = null;
        String matricula = null;
        String generacion = null;
        Carrera carrera = null;
        Tesis tesis = null;
        String valores = null;
        /*guarda info de candidato en la base de datos*/
        this.candidato = candidato;
        /*variables de Candidato*/
        matricula = candidato.getMatricula();
        creditos = candidato.getCreditos();
        generacion = candidato.getGeneracion();
        nombre= candidato.getNombre();
        apellidoPaterno = candidato.getApellidoPaterno();
        apellidoMaterno = candidato.getApellidoMaterno();
        correoElectronico = candidato.getCorreoElectronico();
        telefono = candidato.getTelefono();
        /*Variables de tesis*/
        tesis = candidato.getTesis();
        nombreTesis= tesis.getTema();
        directorTesis= tesis.getDirector();
        creditos = candidato.getCreditos();
        foto = candidato.getFoto();
        /*vaeriables de carrera*/
        //carrera = candidato.getCarrera();
        //nombreCarrera = carrera.getNombre();
        //foto = candidato.getFoto();
        /*  anteriormemte agregamos imagen con este codigo
        imagen= hongo.getBytesImg();
        */
	mensaje = conectate();
	if(conexion != null){
            try{
		proposicion = conexion.createStatement();
                //sirve para conectarse sabe ir a la base de
                //datos y ejecuta lo que le pidamos
		valores= "'"+matricula+"','"+ nombre+"','"+apellidoPaterno
                        +"','"+apellidoMaterno+"','"+correoElectronico
                        +"','"+nombreTesis+"','"+directorTesis+"','"
                        +creditos+"','"+generacion+"','"+telefono
                        +"','sin asignar','Ingenieria de software','"
                        +foto+"'";
		ordenSQL="INSERT INTO candidatos VALUES("+valores+") ";
		System.out.println(ordenSQL);
	        proposicion.executeUpdate(ordenSQL);//para modificar la base
                //de datos por eso no se necesita un result set
	        proposicion.close();
            }catch(SQLException sqle){
		mensaje="fallo actualizacion";
		sqle.printStackTrace();
            }finally{
		try{
                    conexion.close();
			}catch(SQLException sqle){
                            mensaje="falla conexcion";
			}
            }
	}else{
            mensaje="fallo conexion";
	}
	return mensaje;
    }
    public String insertarAsesor(Asesor asesor){
        String mensaje=null;
        String ordenSQL=null;
        Statement proposicion=null;
        //variables de candidato
        String nombre = null;
        String apellidoPaterno = null;
        String apellidoMaterno = null;
        String correoElectronico = null;
        String telefono = null;
        String cubiculo = null;
        Horario horario = null;
        String privilegios= null;
        String valores = null;
        //buscamos guardar info de candidato en la base de datos
        this.asesor = asesor;
        nombre= asesor.getNombre();
        apellidoPaterno = asesor.getApellidoPaterno();
        apellidoMaterno = asesor.getApellidoMaterno();
        correoElectronico = asesor.getCorreoElectronico();
        telefono = "" + asesor.getTelefono();
        cubiculo = asesor.getCubiculo();
        privilegios= "no privilegios";
	mensaje = conectate();
	if(conexion != null){
            try{
                proposicion = conexion.createStatement();//sirve para conectarse
                        //sabe ir a la base de datos y ejecuta lo que le pidamos
                valores= "'"+nombre+"','"+apellidoPaterno+"','"
                        +apellidoMaterno+"','"+telefono+"','"+cubiculo
                        +"','"+correoElectronico+"','"+privilegios+"'";
                ordenSQL="INSERT INTO asesores VALUES("+valores+") ";
                System.out.println(ordenSQL);
                proposicion.executeUpdate(ordenSQL);//para modificar la base
                            //de datos por eso no se necesita un result set
                proposicion.close();
            }catch(SQLException sqle){
                mensaje="fallo actualizacion";
                sqle.printStackTrace();
            }finally{
                try{
                    conexion.close();
                }catch(SQLException sqle){
                    mensaje="falla conexcion";
                }
            }
        }else{
            mensaje="fallo conexion";
	}
            return mensaje;
    }
    public DefaultTableModel consultaListaAsesores() {
    String mensaje = null;
    Statement proposicion = null;
    ResultSet rs = null;
    candidato = new Candidato();
    String ordenSQL = null;
    lista = new DefaultTableModel();
    lista.setColumnIdentifiers(new Object[]{"CORREO ELECTRONICO",
        "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO"});
    mensaje = conectate();
    if (conexion != null) {
        try {
            proposicion = conexion.createStatement();
            ordenSQL = "SELECT correo_electronico, "
                    +"nombre, apellido_paterno, apellido_materno FROM asesores";
            rs = proposicion.executeQuery(ordenSQL);
            while (rs.next()) {
                lista.addRow(new Object[] {
                    rs.getString("correo_electronico"),
                    rs.getString("nombre"),
                    rs.getString("apellido_paterno"),
                    rs.getString("apellido_materno")});
            }
            rs.close();
            proposicion.close();
        } catch (SQLException sqle) {
            //mensaje="fallo consulta";
            lista = null;
            sqle.printStackTrace();
        }finally {//para desconectarme
            try {
                conexion.close();
            } catch (SQLException sqle) {
                //mensaje="falla conexion";
                lista = null;
            }
        }
        } else {
            lista = null;
        }
        return lista;
    }

    public DefaultTableModel consultaListaCandidatos() {
        String mensaje = null;
        Statement proposicion = null;
        ResultSet rs = null;
        candidato = new Candidato();
        String ordenSQL = null;
        lista = new DefaultTableModel();
        lista.setColumnIdentifiers(new Object[]{
            "CORREO ELECTRONICO", "MATRICULA", "NOMBRE", "APELLIDO PATERNO",
            "APELLIDO MATERNO"});
        mensaje = conectate();
        if (conexion != null) {
            try {
                proposicion = conexion.createStatement();
                ordenSQL = "SELECT correo_electronico, matricula, nombre, "
                        + "apellido_paterno, apellido_materno FROM candidatos";
                rs = proposicion.executeQuery(ordenSQL);

                while (rs.next()) {
                    lista.addRow(new Object[]{rs.getString(
                            "correo_electronico"), rs.getString("matricula"),
                            rs.getString("nombre"),
                            rs.getString("apellido_paterno"),
                            rs.getString("apellido_materno")});
                }
                rs.close();
                proposicion.close();
            } catch (SQLException sqle) {
                //mensaje="fallo consulta";
                lista = null;
                sqle.printStackTrace();
            } finally {//para desconectarme
                try {
                    conexion.close();
                } catch (SQLException sqle) {
                    //mensaje="falla conexion";
                    lista = null;
                }
            }
        } else {
            lista = null;
        }
        return lista;
    }
	
    public String insertarCartasCandidato(Candidato candidato){
        String mensaje=null;
        String ordenSQL=null;
        Statement proposicion=null; 
        byte[] cartaCompromiso = null;
        byte[] cartaExposicion = null;
        String correoElectronico= null;
        String valores = null;
        this.candidato = candidato;
        cartaCompromiso= candidato.getCartaCompromiso();
        cartaExposicion=  candidato.getCartaExp();
        correoElectronico = candidato.getCorreoElectronico();  
        mensaje = conectate();
	if(conexion != null){
            try{
		proposicion = conexion.createStatement();//sirve para conectarse
                        //sabe ir a la base de datos y ejecuta lo que le pidamos
		valores= "'"+cartaCompromiso+"','"
                        + cartaExposicion+"','"+correoElectronico+"'";
		ordenSQL="INSERT INTO cartas VALUES("+valores+") ";
		System.out.println(ordenSQL);
	        proposicion.executeUpdate(ordenSQL);//para modificar la base
                                //de datos por eso no se necesita un result set
	        proposicion.close();
            }catch(SQLException sqle){
		mensaje="fallo actualizacion";
		sqle.printStackTrace();
            }finally{
		try{
                    conexion.close();
		}catch(SQLException sqle){
                    mensaje="falla conexcion";
		}
            }
	}else{
            mensaje="fallo conexion";
	}
	return mensaje;
    }
}

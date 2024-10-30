import java.io.File;
public class RenombrarDirectorios {
    public void renombrarDirectorios(String path){
        //validemos que el path sea un directorio. 
        File directorio = new File(path);
        if(!directorio.exists() || !directorio.isDirectory()){
            System.out.println("La ruta path no es un directorio valido. ");
            return;
        }
        //aca vamos a cambiar los nombres 
        //System.out.println("La ruta path es valida. ");
        renombrarDirectoriosInternos(directorio);


    }
    public void renombrarDirectoriosInternos(File directorio){
        //Listar todos los archivos y carpetas hijas
        File[] directoriosArchivosInternos = directorio.listFiles();
        if(directoriosArchivosInternos == null){
            return;
        }
        for (File directorioArchivo : directoriosArchivosInternos) {
            if (directorioArchivo.isDirectory()) {// Si es carpeta cambia el nombre 
                
                String nuevoNombre = "Nuevos" + " NombreOriginal";
                File nuevoDirectorio = new File(directorioArchivo.getPath(),nuevoNombre);
                if (directorioArchivo.renameTo(nuevoDirectorio)) {
                    renombrarDirectoriosInternos(nuevoDirectorio);
                }
                
            }
        }

    }
    
}

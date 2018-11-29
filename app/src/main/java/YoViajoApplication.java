import android.app.Application;

import es.jaccoding.yoviajoapp.model.repository.ViajesRepository;

public class YoViajoApplication extends Application {

    //Añadir Repositorios necesarios para la tarea
    private ViajesRepository viajesRepository;
    @Override
    public void onCreate() {
        super.onCreate();
        viajesRepository = new ViajesRepository();
    }

    public ViajesRepository getViajesRepository() {
        return viajesRepository;
    }
}

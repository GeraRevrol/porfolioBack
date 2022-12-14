
package com.Backend.PortfolioGera.Security.Service;

import com.Backend.PortfolioGera.Security.Entity.Rol;
import com.Backend.PortfolioGera.Security.Enums.RolNombre;
import com.Backend.PortfolioGera.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}

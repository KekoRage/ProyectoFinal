/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;
import com.example.model.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.service.HistoricoService;
import com.example.dao.HistoricoRepository;
import com.example.model.Historico;
import java.util.Calendar;

@Service
public class HistoricoServiceImp implements HistoricoService
{
@Autowired
private HistoricoRepository repositorio;
	@Override
	public List<Historico>listadoHistorico() {
		return repositorio.findAll();
	}

        @Override
	public Historico altaHistorico(Historico p) {
            Calendar c = Calendar.getInstance();
            String dia = Integer.toString(c.get(Calendar.DATE));
            String mes = Integer.toString(c.get(Calendar.MONTH)+1);
            String annio = Integer.toString(c.get(Calendar.YEAR));
            String fecha=annio+"-"+mes+"-"+dia;
                p.setFecha(fecha);
		return repositorio.save(p);
		
        }

  
}


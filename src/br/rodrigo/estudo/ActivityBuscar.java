package br.rodrigo.estudo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActivityBuscar extends MainActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_buscar);
		
		// Mesmo com este trecho comentado o botão aparece. Por que? 
		//getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
	}

		
}

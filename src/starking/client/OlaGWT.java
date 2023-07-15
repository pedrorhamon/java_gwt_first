package starking.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * @author pedroRhamon
 */
public class OlaGWT implements EntryPoint {
	
	private Label lbl = new Label("Olá GWT");
	private Button btnOk = new Button("ok");
	private TextBox textOla = new TextBox();
	
	private Label lbl2 = new Label("Numero 1:");
	private Label lbl3 = new Label("Numero 2:");
	private TextBox text = new TextBox();
	private TextBox text2 = new TextBox();
	private Label lblResposta = new Label("Resposta");
	private Button btnCalculo = new Button("calcular");
	
	public void onModuleLoad() {
		RootPanel.get().add(lbl);
		RootPanel.get().add(btnOk);
		RootPanel.get().add(textOla);
		
		btnOk.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Olá GWT" + textOla.getText());
			}
		});
		
		RootPanel.get().add(lbl2);
		RootPanel.get().add(lbl3);
		RootPanel.get().add(text);
		RootPanel.get().add(text2);
		RootPanel.get().add(lblResposta);
		RootPanel.get().add(btnCalculo);
		
		btnCalculo.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				int n1 = Integer.parseInt(text.getText());
				int n2 = Integer.parseInt(text2.getText());
				int media = (n1+n2)/2;
				lblResposta.setText("Media: " + media);
			}
		});
	}
}

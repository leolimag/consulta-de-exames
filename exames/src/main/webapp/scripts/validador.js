/**
 *  valida o formulário
 */
 
 function validar(){
	 let nomePac = fExame.nomePac.value
	 let nomeEx =fExame.nomeEx.value
	 let data = fExame.data.value
	 let resultado = fExame.resultado.value
	 let dataAtual = new Date()
	 let ano = dataAtual.getFullYear()
	 let mes = dataAtual.getMonth() 
	 let dia = dataAtual.getDate()

	 listaData = data.split("-")
	 
	if (nomePac === ""){
		alert("Preencha o nome do paciente.")
		fExame.nomePac.focus()
		return false
	} 
	else if (nomeEx === ""){
		alert("Preencha o nome do exame.")
		fExame.nomeEx.focus()
		 return false
	}
	else if (data === ""){
		alert("Preencha a data do exame.")
		fExame.data.focus()
		return false
	} 
	else if (resultado === ""){
		alert("Preencha o resultado do exame.")
		fExame.resultado.focus()
		return false
	} 
	else if (lista[0] > ano){
		alert("Atenção! Insira uma data anterior à data atual.")
		fExame.data.focus()
		return false
	}
	else if (lista[0] == ano){
		if (lista[1] > mes){
			alert("Atenção! Insira uma data anterior à data atual.")
			fExame.data.focus()
			return false	
		}
		else if (lista[1] == mes){
			if (lista[2] < dia){
				document.forms['fExame'].submit()
			}
			else {
				alert("Atenção! Insira uma data anterior à data atual.")
				fExame.data.focus()
				return false		
			}
		}
		else {
			document.forms['fExame'].submit()
		}
	}
	else {
		 document.forms['fExame'].submit()
	}
	 
 }
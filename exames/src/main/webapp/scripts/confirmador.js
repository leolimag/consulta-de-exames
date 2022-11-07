/**
 *  confirmar a exlusão 
 */
 
 function confirmar(id){
	 let resposta = confirm("Confirma a exclusão deste exame?")
	 if (resposta === true){
		 window.location.href = "delete?id=" + id
	 }
 }

function ms_initDetailLink(referenceTag){
   var selId = referenceTag.value;
   var all = new Array();
   all = document.getElementsByName('buildStepId');
   for(var i = 0; i < all.length; i++) {
	   if(referenceTag == all.item(i)){
		   var detailsLinkTag = document.getElementsByName('showDetailLink').item(i);
		   if(selId.length != 0){
			   detailsLinkTag .href="/configfiles/show?id=".concat(selId);
			   detailsLinkTag .style.display = 'block';
			}else{
			   detailsLinkTag .style.display = 'none';
			}
	   }
   }
}


function ms_descArguments(referenceTag, desc){
   var all = new Array();
   all = document.getElementsByName('buildStepId');
   for(var i = 0; i < all.length; i++) {
	   if(referenceTag == all.item(i)){
		   var descriptionTag = document.getElementsByName('argumentDescription').item(i);
		   descriptionTag.innerHTML = desc;
	   }
    }	   
}

function ms_showParams(referenceTag, scriptId){
	desc.getArgsDescription(scriptId, function(t) {
      ms_descArguments(referenceTag, t.responseObject());			      
    });
}



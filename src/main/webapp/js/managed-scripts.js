/**
 * initializes the detail links for all managed script builder
 */
function ms_initDetailLinks(){
   var all = new Array();
   all = document.getElementsByName('buildStepId');
   for(var i = 0; i < all.length; i++) {
        var selId = all.item(i).value;
        var allDetails = document.getElementsByName('showDetail');
        if(selId.length != 0){
        	allDetails.item(i).href="/configfiles/show?id=".concat(selId);
        	allDetails.item(i).style.display = 'block';
    	}else{
    		allDetails.item(i).style.display = 'none';
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




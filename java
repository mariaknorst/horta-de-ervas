const ervas = {

"enjoo":"Hortelã",
"dor de cabeça":"Hortelã",
"tosse":"Guaco",
"ansiedade":"Camomila",
"insônia":"Erva-cidreira",
"má digestão":"Boldo",
"cólica":"Camomila",
"estresse":"Melissa",
"azia":"Espinheira-santa",
"gripe":"Gengibre",
"resfriado":"Gengibre",
"dor de garganta":"Sálvia",
"congestão nasal":"Eucalipto",
"fadiga":"Alecrim",
"nervosismo":"Camomila",
"indigestão":"Boldo",
"gases":"Erva-doce",
"náusea":"Hortelã",
"diarreia":"Goiabeira",
"constipação":"Sene",
"pele irritada":"Babosa",
"queimadura leve":"Babosa",
"coceira":"Calêndula",
"acne":"Babosa",
"caspa":"Alecrim",
"queda de cabelo":"Alecrim",
"mau hálito":"Hortelã",
"dor muscular":"Arnica",
"dor articular":"Arnica",
"cansaço":"Alecrim",
"agitação":"Camomila",
"irritabilidade":"Erva-cidreira",
"catarro":"Guaco",
"bronquite":"Guaco",
"alergia leve":"Camomila",
"picada de inseto":"Calêndula",
"pele seca":"Babosa",
"enxaqueca":"Hortelã",
"desconforto estomacal":"Boldo",
"relaxamento":"Camomila",
"sono ruim":"Erva-cidreira",
"tensão":"Melissa",
"rouquidão":"Sálvia",
"desânimo":"Alecrim",
"mal-estar":"Gengibre",
"feridas":"Babosa",
"pressão emocional":"Melissa",
"dificuldade para dormir":"Camomila",
"digestão lenta":"Boldo",
"irritação na pele":"Calêndula"

};

function buscarErva(){

let sintoma =
document.getElementById("sintoma")
.value
.toLowerCase()
.trim();

let resultado =
document.getElementById("resultado");

if(ervas[sintoma]){

resultado.innerHTML =
`<h2>🌿 Erva sugerida:</h2>
<p>${ervas[sintoma]}</p>`;

}else{

resultado.innerHTML =
"<p>Sintoma não encontrado.</p>";

}

}

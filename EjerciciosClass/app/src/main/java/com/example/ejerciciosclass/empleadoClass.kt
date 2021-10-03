package com.example.ejerciciosclass

class empleadoClass (val nombre: String, var sueldo: Double, val area: Array<areas>?=null, val cargo: Array<cargos>?=null, var tiempoLaborando: Int){

    enum class  cargos{
        DIRECTORDERECORSOSHUMANOS,
        SEO,
        JEFEDEPRODUCCION,
        PROGRAMADOR
    }
    enum class areas{
        ADMINISTRACION,
        MARKETING,
        PRODUCCION,
        IMFORMATICA
    }

    fun areaEmpleado (){
        if (area != null) {
            for(area:areas in area){
                println("Area: $area")
            }
        }
    }

    fun cargoEmpleado (){
        if (cargo != null){
            for(cargo:cargos in cargo){
                println("Cargo: $cargo")
            }
        }
    }
}
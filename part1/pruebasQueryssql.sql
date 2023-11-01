-- SQLite
SELECT name, species, age FROM animals
LEFT JOIN people_animals
ON animal_id == pet_id WHERE owner_id IS NULL
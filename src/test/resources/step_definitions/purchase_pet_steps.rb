require 'java'
require 'rubygems'

java_import com.mypetstore.service.MyPetServiceImpl

Given /^the pet store has (\d+) puppies for sale$/ do |total|
  @mypetservice = MyPetServiceImpl.new

  pending
end